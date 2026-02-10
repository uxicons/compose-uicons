package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Rs.UserBasket: ImageVector
    get() = _UserBasket ?: UXIcon(name = "UserBasket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.14f, 15f)
                lineToRelative(2.28f, -4.55f)
                lineToRelative(-1.79f, -0.9f)
                lineToRelative(-2.72f, 5.45f)
                horizontalLineToRelative(-5.76f)
                lineToRelative(0.94f, 6.43f)
                curveToRelative(0.21f, 1.46f, 1.49f, 2.56f, 2.97f, 2.56f)
                horizontalLineToRelative(4.94f)
                curveToRelative(1.48f, 0f, 2.75f, -1.1f, 2.97f, -2.56f)
                lineToRelative(0.95f, -6.44f)
                horizontalLineToRelative(-4.77f)
                close()
                moveTo(20.99f, 21.15f)
                curveToRelative(-0.07f, 0.49f, -0.5f, 0.85f, -0.99f, 0.85f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-0.49f, 0f, -0.92f, -0.37f, -0.99f, -0.85f)
                lineToRelative(-0.61f, -4.14f)
                horizontalLineToRelative(8.14f)
                lineToRelative(-0.61f, 4.15f)
                close()
                moveTo(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(8.98f, 14f)
                lineToRelative(0.29f, 2f)
                lineTo(5f, 16f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.98f)
                close()
            }
        }.also { _UserBasket = it}
