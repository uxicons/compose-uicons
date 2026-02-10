package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePrescription: ImageVector? = null

val Icons.Ts.FilePrescription: ImageVector
    get() = _FilePrescription ?: UXIcon(name = "FilePrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
                moveTo(14.88f, 14f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(-1.68f, 2.51f)
                lineToRelative(-2.49f, -3.72f)
                curveToRelative(0.88f, -0.39f, 1.49f, -1.27f, 1.49f, -2.29f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.45f)
                lineToRelative(2.94f, 4.41f)
                lineToRelative(-2.4f, 3.59f)
                horizontalLineToRelative(1.2f)
                lineToRelative(1.8f, -2.69f)
                lineToRelative(1.8f, 2.69f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-2.4f, -3.59f)
                lineToRelative(2.28f, -3.41f)
                close()
                moveTo(6f, 9.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _FilePrescription = it}
