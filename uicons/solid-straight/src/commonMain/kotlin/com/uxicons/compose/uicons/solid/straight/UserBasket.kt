package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Ss.UserBasket: ImageVector
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
                moveTo(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(11.08f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(3.98f)
                lineToRelative(1.13f, 7.72f)
                curveToRelative(0.12f, 0.85f, 0.48f, 1.62f, 0.97f, 2.27f)
                close()
            }
        }.also { _UserBasket = it}
