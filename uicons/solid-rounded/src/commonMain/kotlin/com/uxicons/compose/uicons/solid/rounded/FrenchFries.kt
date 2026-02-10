package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrenchFries: ImageVector? = null

val Icons.Sr.FrenchFries: ImageVector
    get() = _FrenchFries ?: UXIcon(name = "FrenchFries") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.16f, 24f)
                lineTo(5.84f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.9f, -4.02f)
                lineTo(0.06f, 15.59f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                lineTo(21f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.94f, 3.59f)
                lineToRelative(-0.88f, 4.39f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.16f, 24f)
                close()
                moveTo(22.64f, 5.94f)
                arcToRelative(3.45f, 3.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, -1.92f)
                curveToRelative(1.27f, -4.03f, -4.36f, -5.76f, -5.4f, -1.71f)
                lineToRelative(-0.08f, 0.4f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.8f, 0f)
                lineToRelative(-0.08f, -0.4f)
                curveTo(8.99f, -1.74f, 3.36f, -0.01f, 4.63f, 4.01f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.19f, 8.58f)
                lineTo(1.68f, 10f)
                lineTo(3.8f, 10f)
                lineTo(3.08f, 7.93f)
                arcTo(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 6.12f)
                lineTo(5.69f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5.31f)
                lineTo(19f, 6.12f)
                arcToRelative(1.46f, 1.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.92f, 1.82f)
                lineTo(20.2f, 10f)
                horizontalLineToRelative(2.12f)
                curveTo(22.8f, 8.75f, 23.37f, 7.21f, 22.64f, 5.94f)
                close()
            }
        }.also { _FrenchFries = it}
