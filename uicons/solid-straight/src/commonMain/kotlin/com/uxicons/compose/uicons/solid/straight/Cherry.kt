package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cherry: ImageVector? = null

val Icons.Ss.Cherry: ImageVector
    get() = _Cherry ?: UXIcon(name = "Cherry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.68f, 14f)
                arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.79f, 0.48f)
                curveToRelative(-0.41f, -1.42f, -2.58f, -8.65f, -6.08f, -13.45f)
                lineTo(12.04f, -0.03f)
                lineTo(11.22f, 1f)
                curveTo(7.48f, 5.66f, 5.48f, 12.98f, 5.1f, 14.48f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.29f, 14f)
                curveTo(1.68f, 14f, 0f, 15.52f, 0f, 18.08f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.9f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -5.9f)
                curveTo(12f, 15.52f, 10.31f, 14f, 8.68f, 14f)
                arcToRelative(3.65f, 3.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.47f, 0.33f)
                arcTo(40.66f, 40.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.97f, 3.35f)
                arcToRelative(49.48f, 49.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.79f, 10.98f)
                arcTo(3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.29f, 14f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.05f, 0.9f)
                arcTo(6.71f, 6.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 18.08f)
                arcToRelative(7.75f, 7.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 3.48f)
                arcTo(6.02f, 6.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 23.98f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -5.9f)
                curveTo(24f, 15.52f, 22.31f, 14f, 20.68f, 14f)
                close()
            }
        }.also { _Cherry = it}
