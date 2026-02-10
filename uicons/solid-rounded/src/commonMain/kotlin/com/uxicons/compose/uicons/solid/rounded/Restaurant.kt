package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Sr.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.73f, 22.31f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.46f, 1.37f)
                lineToRelative(-5.48f, -5.84f)
                curveToRelative(-1.04f, 0.03f, -5.81f, 0.17f, -4.31f, -2.08f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, -0.25f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 0.29f)
                arcToRelative(1.26f, 1.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.09f, 0.4f)
                close()
                moveTo(15f, 14f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, -1.46f)
                lineToRelative(5.17f, -5.17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22.29f, 5.95f)
                lineToRelative(-5.17f, 5.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.41f, 0.58f)
                lineToRelative(6.99f, -6.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, -1.41f)
                lineTo(12.3f, 10.28f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.58f, -3.41f)
                lineTo(18.05f, 1.71f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.64f, 0.29f)
                lineTo(11.46f, 5.46f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.64f, 6.29f)
                lineTo(0.29f, 22.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.41f)
                lineTo(12.24f, 13.17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14f)
                close()
                moveTo(5.45f, 12.96f)
                curveToRelative(0.83f, 0.78f, 1.59f, -0.26f, 2.15f, -0.81f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, -1.8f)
                curveToRelative(-0.62f, -1.72f, 0.89f, -3.73f, -0.36f, -5.12f)
                lineTo(3.33f, 0.57f)
                arcTo(1.96f, 1.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.95f)
                curveTo(0.24f, 6.57f, 1.94f, 8.92f, 5.45f, 12.96f)
                close()
            }
        }.also { _Restaurant = it}
