package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeCrossed: ImageVector? = null

val Icons.Ss.EyeCrossed: ImageVector
    get() = _EyeCrossed ?: UXIcon(name = "EyeCrossed") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.82f, 11.18f)
                verticalLineToRelative(0f)
                arcToRelative(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.14f, -5.44f)
                lineToRelative(3.03f, -3.03f)
                lineTo(21.29f, 1.29f)
                lineTo(18f, 4.58f)
                arcTo(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                curveTo(4.5f, 3f, 1.06f, 9.26f, 0.18f, 11.18f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.64f)
                arcToRelative(15.74f, 15.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.14f, 5.44f)
                lineTo(1.29f, 21.29f)
                lineToRelative(1.41f, 1.41f)
                lineTo(6f, 19.42f)
                arcTo(11.78f, 11.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                curveToRelative(7.5f, 0f, 10.94f, -6.26f, 11.82f, -8.18f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.82f, 11.18f)
                close()
                moveTo(6f, 12f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.47f, -4.88f)
                lineTo(14.02f, 8.57f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.57f, 2.02f)
                lineTo(7.12f, 15.47f)
                arcTo(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                close()
                moveTo(12f, 18f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.47f, -1.11f)
                lineToRelative(1.45f, -1.45f)
                arcTo(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.57f, -2.02f)
                lineToRelative(1.45f, -1.45f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                close()
            }
        }.also { _EyeCrossed = it}
