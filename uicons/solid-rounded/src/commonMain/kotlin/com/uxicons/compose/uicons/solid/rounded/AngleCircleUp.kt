package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleCircleUp: ImageVector? = null

val Icons.Sr.AngleCircleUp: ImageVector
    get() = _AngleCircleUp ?: UXIcon(name = "AngleCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 24f)
                close()
                moveTo(12f, 8f)
                arcToRelative(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.99f, 0.75f)
                curveToRelative(0.33f, 0.29f, 0.64f, 0.57f, 0.84f, 0.78f)
                lineTo(17.7f, 12.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.4f, 1.43f)
                lineTo(13.42f, 10.95f)
                curveToRelative(-0.19f, -0.19f, -0.47f, -0.44f, -0.76f, -0.7f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, 0f)
                curveToRelative(-0.29f, 0.26f, -0.57f, 0.51f, -0.75f, 0.69f)
                lineTo(7.7f, 13.78f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.4f, -1.43f)
                lineTo(9.18f, 9.52f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.48f, 0.83f, -0.77f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                close()
            }
        }.also { _AngleCircleUp = it}
