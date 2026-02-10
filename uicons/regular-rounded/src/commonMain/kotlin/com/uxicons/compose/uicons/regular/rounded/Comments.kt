package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Rr.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16f)
                verticalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(16f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.92f, -4f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.24f, -0.25f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 22f)
                horizontalLineToRelative(5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(22f, 16f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.25f, -4.68f)
                arcTo(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 9.08f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 16f)
                close()
                moveTo(17.98f, 9.65f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.35f, 0.02f)
                arcTo(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 9.29f)
                verticalLineToRelative(5.04f)
                curveTo(0f, 16.87f, 1.51f, 18f, 3f, 18f)
                lineTo(8.7f, 18f)
                arcTo(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.98f, 9.65f)
                close()
                moveTo(13.95f, 4.05f)
                arcToRelative(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 5.46f)
                arcTo(7.36f, 7.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.7f, 16f)
                lineTo(3f, 16f)
                curveToRelative(-0.93f, 0f, -1f, -1.27f, -1f, -1.67f)
                lineTo(2f, 9.29f)
                arcTo(7.36f, 7.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.49f, 2.02f)
                quadTo(8.74f, 2f, 8.99f, 2f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.95f, 4.05f)
                close()
            }
        }.also { _Comments = it}
