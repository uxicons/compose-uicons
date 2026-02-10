package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Turkey: ImageVector? = null

val Icons.Rs.Turkey: ImageVector
    get() = _Turkey ?: UXIcon(name = "Turkey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 0f)
                lineTo(9f, 0f)
                close()
                moveTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(5f, 0f)
                lineTo(3f, 0f)
                lineTo(3f, 4f)
                lineTo(5f, 4f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 5.22f, -9.4f, 6f, -15f, 6f)
                arcTo(81.72f, 81.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, 22.99f)
                lineTo(0f, 22.85f)
                lineTo(0f, 16f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 7f)
                arcToRelative(18.14f, 18.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.41f, 0.16f)
                arcTo(17.52f, 17.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.09f, 6f)
                lineToRelative(0.43f, -0.01f)
                lineToRelative(0.54f, 0.54f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.06f, -0.65f)
                arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.31f, 2.22f)
                lineTo(19.48f, 7.94f)
                lineToRelative(0.54f, 0.54f)
                lineTo(20f, 8.91f)
                curveToRelative(-0.01f, 0.19f, -0.04f, 0.9f, -0.16f, 1.83f)
                curveTo(22.44f, 12.86f, 24f, 15.55f, 24f, 18f)
                close()
                moveTo(10f, 12.31f)
                arcToRelative(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.08f, 2.61f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.21f, 0f)
                curveToRelative(1.15f, -1.15f, 1.58f, -4.15f, 1.68f, -5.65f)
                lineTo(16.73f, 8.02f)
                curveToRelative(-1.5f, 0.11f, -4.51f, 0.54f, -5.65f, 1.68f)
                arcTo(3.67f, 3.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12.31f)
                close()
                moveTo(22f, 18f)
                arcToRelative(7.52f, 7.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.61f, -4.99f)
                arcToRelative(7.54f, 7.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.68f, 3.32f)
                arcTo(5.68f, 5.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.08f, 9f)
                arcTo(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 16f)
                verticalLineToRelative(5.15f)
                arcTo(68.5f, 68.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 22f)
                curveTo(15f, 22f, 22f, 20.95f, 22f, 18f)
                close()
            }
        }.also { _Turkey = it}
