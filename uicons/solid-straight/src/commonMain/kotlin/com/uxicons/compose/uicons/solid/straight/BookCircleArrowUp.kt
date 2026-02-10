package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowUp: ImageVector? = null

val Icons.Ss.BookCircleArrowUp: ImageVector
    get() = _BookCircleArrowUp ?: UXIcon(name = "BookCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                close()
                moveTo(18.74f, 15.31f)
                lineToRelative(2.69f, 2.69f)
                horizontalLineToRelative(-2.43f)
                reflectiveCurveToRelative(0f, 3f, 0f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                reflectiveCurveToRelative(-2.45f, 0f, -2.45f, 0f)
                lineToRelative(2.69f, -2.69f)
                curveToRelative(0.42f, -0.42f, 1.09f, -0.42f, 1.51f, 0f)
                close()
                moveTo(2.0f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(0.0f, 3f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(10.0f, 18f)
                horizontalLineToRelative(-4f)
                lineTo(6.0f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8.25f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.25f, -2f, -0.25f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                close()
                moveTo(12.71f, 24f)
                lineTo(2f, 24f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8.25f)
                curveToRelative(0.41f, 1.57f, 1.28f, 2.96f, 2.46f, 4f)
                close()
            }
        }.also { _BookCircleArrowUp = it}
