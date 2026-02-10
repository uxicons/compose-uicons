package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowProgressAlt: ImageVector? = null

val Icons.Ts.ArrowProgressAlt: ImageVector
    get() = _ArrowProgressAlt ?: UXIcon(name = "ArrowProgressAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                lineTo(4f, 12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(18.69f)
                lineToRelative(-2.97f, -2.68f)
                lineToRelative(0.67f, -0.74f)
                lineToRelative(3.12f, 2.81f)
                curveToRelative(0.31f, 0.28f, 0.49f, 0.69f, 0.49f, 1.11f)
                reflectiveCurveToRelative(-0.18f, 0.83f, -0.49f, 1.11f)
                lineToRelative(-3.12f, 2.81f)
                lineToRelative(-0.67f, -0.74f)
                lineToRelative(2.97f, -2.68f)
                lineTo(4f, 5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13.38f, 15.58f)
                lineToRelative(-0.67f, 0.74f)
                lineToRelative(2.97f, 2.68f)
                lineTo(7f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8.68f)
                lineToRelative(-3.01f, 2.62f)
                lineToRelative(0.66f, 0.75f)
                lineToRelative(3.18f, -2.77f)
                curveToRelative(0.31f, -0.28f, 0.49f, -0.69f, 0.49f, -1.11f)
                reflectiveCurveToRelative(-0.18f, -0.83f, -0.49f, -1.11f)
                lineToRelative(-3.12f, -2.81f)
                close()
                moveTo(-0f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                lineTo(0f, 22f)
                verticalLineToRelative(-5f)
                close()
                moveTo(1f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                lineTo(1f, 18f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 17f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _ArrowProgressAlt = it}
