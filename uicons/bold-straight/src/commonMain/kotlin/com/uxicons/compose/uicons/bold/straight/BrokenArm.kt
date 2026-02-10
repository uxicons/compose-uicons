package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenArm: ImageVector? = null

val Icons.Bs.BrokenArm: ImageVector
    get() = _BrokenArm ?: UXIcon(name = "BrokenArm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 20f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.3f)
                lineToRelative(0.45f, -0.54f)
                curveToRelative(0.51f, -0.62f, 0.45f, -1.53f, -0.14f, -2.07f)
                curveToRelative(-0.59f, -0.54f, -1.51f, -0.52f, -2.07f, 0.05f)
                lineToRelative(-2.56f, 2.56f)
                horizontalLineToRelative(-2.88f)
                lineTo(11f, 5f)
                horizontalLineToRelative(-1f)
                lineTo(10f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3f)
                lineTo(4f, 0f)
                lineTo(1f, 0f)
                verticalLineToRelative(5f)
                lineTo(0f, 5f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                horizontalLineToRelative(14f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(4.64f)
                lineToRelative(-4.64f, 4.24f)
                verticalLineToRelative(-4.24f)
                close()
                moveTo(3f, 16.5f)
                verticalLineToRelative(-0.2f)
                lineToRelative(5f, -4.57f)
                verticalLineToRelative(3.09f)
                lineToRelative(-4.35f, 3.97f)
                curveToRelative(-0.41f, -0.68f, -0.65f, -1.46f, -0.65f, -2.3f)
                close()
                moveTo(7.5f, 21f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.11f, -1.51f, -0.28f)
                lineToRelative(2.92f, -2.67f)
                lineToRelative(3.25f, 2.95f)
                horizontalLineToRelative(-4.67f)
                close()
                moveTo(15f, 19.52f)
                lineToRelative(-3.86f, -3.5f)
                lineToRelative(0.02f, -0.02f)
                horizontalLineToRelative(3.84f)
                verticalLineToRelative(3.52f)
                close()
            }
        }.also { _BrokenArm = it}
