package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BasketShoppingPlus: ImageVector? = null

val Icons.Rs.BasketShoppingPlus: ImageVector
    get() = _BasketShoppingPlus ?: UXIcon(name = "BasketShoppingPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 8f)
                curveTo(20.44f, 3.51f, 16.62f, 0f, 12f, 0f)
                reflectiveCurveTo(3.56f, 3.51f, 3.06f, 8f)
                lineTo(0.05f, 8f)
                lineToRelative(1.95f, 13.3f)
                curveToRelative(0.23f, 1.54f, 1.57f, 2.69f, 3.12f, 2.69f)
                horizontalLineToRelative(13.79f)
                curveToRelative(1.55f, 0f, 2.9f, -1.16f, 3.12f, -2.69f)
                lineToRelative(1.95f, -13.3f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(12f, 2f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.92f, 6f)
                lineTo(5.08f, 8f)
                curveToRelative(0.49f, -3.39f, 3.4f, -6f, 6.92f, -6f)
                close()
                moveTo(20.06f, 21.01f)
                curveToRelative(-0.08f, 0.56f, -0.57f, 0.99f, -1.14f, 0.99f)
                lineTo(5.12f, 22f)
                curveToRelative(-0.57f, 0f, -1.06f, -0.42f, -1.14f, -0.99f)
                lineToRelative(-1.62f, -11.01f)
                lineTo(21.68f, 10f)
                lineToRelative(-1.62f, 11.01f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _BasketShoppingPlus = it}
