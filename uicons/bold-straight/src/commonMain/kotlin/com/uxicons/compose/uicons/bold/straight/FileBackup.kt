package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileBackup: ImageVector? = null

val Icons.Bs.FileBackup: ImageVector
    get() = _FileBackup ?: UXIcon(name = "FileBackup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7.81f)
                curveToRelative(0.56f, 0.12f, 1.22f, 0.19f, 2f, 0.19f)
                curveToRelative(0.77f, 0f, 1.44f, -0.07f, 2f, -0.19f)
                verticalLineToRelative(1.19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0f, -1.18f, -2.06f, -2f, -5f, -2f)
                reflectiveCurveToRelative(-5f, 0.82f, -5f, 2f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.19f)
                close()
                moveTo(15f, 3.86f)
                curveToRelative(0.6f, 0.09f, 1.27f, 0.14f, 2f, 0.14f)
                reflectiveCurveToRelative(1.4f, -0.05f, 2f, -0.14f)
                verticalLineToRelative(1.88f)
                curveToRelative(-0.42f, 0.14f, -1.06f, 0.26f, -2f, 0.26f)
                curveToRelative(-0.95f, 0f, -1.59f, -0.12f, -2f, -0.24f)
                close()
                moveTo(5.92f, 11f)
                lineTo(3f, 19.38f)
                verticalLineToRelative(-10.38f)
                horizontalLineToRelative(7f)
                reflectiveCurveToRelative(0f, -4.98f, 0f, -4.98f)
                lineToRelative(-3.61f, -2.02f)
                horizontalLineToRelative(-2.89f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(20.1f)
                lineToRelative(3.9f, -13f)
                horizontalLineToRelative(-18.08f)
                close()
                moveTo(17.87f, 21f)
                horizontalLineToRelative(-12.26f)
                lineToRelative(2.44f, -7f)
                horizontalLineToRelative(11.92f)
                close()
            }
        }.also { _FileBackup = it}
