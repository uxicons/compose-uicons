package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bowling: ImageVector? = null

val Icons.Sr.Bowling: ImageVector
    get() = _Bowling ?: UXIcon(name = "Bowling") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.45f, 5.83f)
                arcTo(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 0f)
                arcToRelative(7.17f, 7.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.45f, 1.82f)
                arcTo(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 8f)
                lineTo(3f, 8f)
                arcTo(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.45f, 5.83f)
                close()
                moveTo(9.51f, 10f)
                lineTo(2.49f, 10f)
                curveToRelative(-0.22f, 0.5f, -0.48f, 1.01f, -0.75f, 1.54f)
                arcTo(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 17f)
                arcToRelative(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 4.7f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.61f, 24f)
                lineTo(7.39f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.62f, -2.3f)
                arcTo(11.08f, 11.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 17f)
                arcToRelative(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.74f, -5.46f)
                curveTo(9.99f, 11.01f, 9.73f, 10.5f, 9.51f, 10f)
                close()
                moveTo(24f, 16f)
                arcToRelative(8.01f, 8.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.53f, 7.18f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.36f, -0.64f)
                arcTo(13.05f, 13.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 17f)
                arcToRelative(13.58f, 13.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.96f, -6.38f)
                curveToRelative(-0.21f, -0.4f, -0.41f, -0.8f, -0.58f, -1.18f)
                arcTo(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(18f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 15f)
                close()
                moveTo(20f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                close()
                moveTo(22f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
                close()
            }
        }.also { _Bowling = it}
