package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Restaurant: ImageVector? = null

val Icons.Rr.Restaurant: ImageVector
    get() = _Restaurant ?: UXIcon(name = "Restaurant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.33f, 7.24f)
                curveTo(0.48f, 5.52f, -1.2f, 1.27f, 1.2f, 0.15f)
                arcTo(1.95f, 1.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.33f, 0.57f)
                lineToRelative(4.96f, 5.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.89f, 7.3f)
                lineTo(2f, 2.08f)
                curveToRelative(0.12f, 3.78f, 2.34f, 6.6f, 4.84f, 9.44f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.39f, 1.45f)
                arcTo(24.52f, 24.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.33f, 7.24f)
                close()
                moveTo(18.0f, 16.2f)
                arcToRelative(1.26f, 1.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, -0.4f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.46f, -0.29f)
                arcToRelative(0.98f, 0.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.98f, 0.25f)
                curveToRelative(-1.49f, 2.26f, 3.27f, 2.11f, 4.31f, 2.08f)
                lineToRelative(5.48f, 5.84f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.46f, -1.37f)
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
            }
        }.also { _Restaurant = it}
