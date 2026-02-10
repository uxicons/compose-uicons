package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sushi: ImageVector? = null

val Icons.Rr.Sushi: ImageVector
    get() = _Sushi ?: UXIcon(name = "Sushi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 11f)
                curveToRelative(0.07f, 1.29f, 7.94f, 1.29f, 8f, 0f)
                curveTo(12.43f, 9.71f, 4.56f, 9.71f, 4.5f, 11f)
                close()
                moveTo(11.5f, 5f)
                curveToRelative(0.07f, 1.29f, 7.94f, 1.29f, 8f, 0f)
                curveTo(19.43f, 3.71f, 11.56f, 3.71f, 11.5f, 5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.49f, -2.95f, 4.52f, -7f, 4.92f)
                curveTo(18.24f, 25.68f, 0.28f, 25.9f, 0f, 19f)
                lineTo(0f, 11f)
                curveTo(0f, 8.5f, 2.97f, 6.49f, 7f, 6.08f)
                curveTo(5.76f, -1.68f, 23.72f, -1.9f, 24f, 5f)
                close()
                moveTo(9f, 5f)
                arcToRelative(1.59f, 1.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, 1.03f)
                arcTo(10.66f, 10.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.33f, 8f)
                curveToRelative(3.74f, 0.09f, 6.73f, -1.56f, 6.67f, -3f)
                curveTo(21.58f, 1.06f, 9.42f, 1.06f, 9f, 5f)
                close()
                moveTo(2f, 11f)
                curveToRelative(0.42f, 3.94f, 12.58f, 3.94f, 13f, 0f)
                curveTo(14.58f, 7.06f, 2.42f, 7.06f, 2f, 11f)
                close()
                moveTo(15f, 19f)
                lineTo(15f, 14.25f)
                curveToRelative(-2.96f, 2.29f, -10.04f, 2.29f, -13f, 0f)
                lineTo(2f, 19f)
                curveTo(2.42f, 22.94f, 14.58f, 22.94f, 15f, 19f)
                close()
                moveTo(22f, 13f)
                lineTo(22f, 8.25f)
                arcToRelative(10.87f, 10.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.19f, 1.69f)
                curveToRelative(0.36f, 0.66f, 0.13f, 5.18f, 0.19f, 5.97f)
                curveTo(20.03f, 15.56f, 22f, 14.21f, 22f, 13f)
                close()
            }
        }.also { _Sushi = it}
