package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pepper: ImageVector? = null

val Icons.Br.Pepper: ImageVector
    get() = _Pepper ?: UXIcon(name = "Pepper") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.17f, 5.12f)
            curveTo(18.72f, 0.4f, 15.53f, 0f, 14.5f, 0f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            curveToRelative(1.12f, 0f, 1.54f, 1.1f, 1.67f, 2.29f)
            arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10.99f)
            arcTo(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 14f)
            curveToRelative(-1.16f, 0f, -2.41f, -0.31f, -2.94f, -2.61f)
            arcToRelative(3.06f, 3.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.05f, 0.55f)
            curveTo(0f, 12.1f, 0f, 12.25f, 0f, 12.41f)
            arcTo(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.97f, 24f)
            arcToRelative(11.76f, 11.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.31f, -3.48f)
            arcTo(12.57f, 12.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 11.65f)
            verticalLineTo(11f)
            arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.17f, 5.12f)
            close()
            moveTo(21f, 11.65f)
            arcToRelative(9.55f, 9.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.84f, 6.74f)
            arcTo(8.79f, 8.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.88f, 21f)
            arcTo(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12.41f)
            curveToRelative(0f, -0.11f, 0f, -0.22f, 0.01f, -0.34f)
            lineToRelative(0.13f, -0.01f)
            curveTo(3.87f, 15.25f, 5.95f, 17f, 9f, 17f)
            arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -5.99f)
            arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -0.91f)
            arcToRelative(4.9f, 4.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.68f, -0.01f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 11f)
            close()
        }
    }.also { _Pepper = it }
