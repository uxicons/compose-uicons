package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileBackup: ImageVector? = null

val Icons.Ss.FileBackup: ImageVector
    get() = _FileBackup ?: UXIcon(name = "FileBackup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 5f)
                curveToRelative(3.04f, 0f, 4.28f, -0.81f, 4.5f, -1.08f)
                verticalLineToRelative(-2.42f)
                curveToRelative(0f, -0.88f, -1.85f, -1.5f, -4.5f, -1.5f)
                reflectiveCurveToRelative(-4.5f, 0.62f, -4.5f, 1.5f)
                verticalLineToRelative(2.42f)
                curveToRelative(0.22f, 0.27f, 1.46f, 1.08f, 4.5f, 1.08f)
                moveToRelative(-9.7f, 4f)
                lineToRelative(-4.8f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3.24f)
                lineToRelative(3.76f, 1.88f)
                verticalLineToRelative(5.12f)
                close()
                moveTo(24f, 11f)
                lineTo(20.4f, 24f)
                horizontalLineToRelative(-16.31f)
                lineToRelative(4.13f, -13f)
                close()
                moveTo(12.03f, 9f)
                curveToRelative(-0.01f, -0.06f, -0.03f, -0.11f, -0.03f, -0.17f)
                verticalLineToRelative(-2.83f)
                reflectiveCurveToRelative(1f, 1f, 4.5f, 1f)
                reflectiveCurveToRelative(4.5f, -1f, 4.5f, -1f)
                verticalLineToRelative(2.83f)
                curveToRelative(0f, 0.06f, -0.02f, 0.11f, -0.03f, 0.17f)
                close()
            }
        }.also { _FileBackup = it}
