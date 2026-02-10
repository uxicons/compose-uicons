package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sun: ImageVector? = null

val Icons.Rs.Sun: ImageVector
    get() = _Sun ?: UXIcon(name = "Sun") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                lineTo(24f, 11f)
                lineTo(18.93f, 11f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.44f, -1.62f)
                lineToRelative(4.39f, -2.56f)
                lineTo(21.88f, 5.09f)
                lineTo(17.48f, 7.65f)
                arcToRelative(7.08f, 7.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -1.14f)
                lineToRelative(2.55f, -4.38f)
                lineTo(17.16f, 1.12f)
                lineToRelative(-2.55f, 4.38f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 5.07f)
                lineTo(13f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 5.07f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 5.5f)
                lineTo(6.85f, 1.12f)
                lineTo(5.13f, 2.13f)
                lineTo(7.67f, 6.5f)
                arcTo(7.05f, 7.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.52f, 7.65f)
                lineTo(2.14f, 5.09f)
                lineTo(1.13f, 6.82f)
                lineTo(5.51f, 9.37f)
                arcTo(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.07f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(5.07f, 13f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.44f, 1.62f)
                lineTo(1.14f, 17.16f)
                lineToRelative(1.01f, 1.73f)
                lineToRelative(4.37f, -2.55f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 1.13f)
                lineTo(5.1f, 21.86f)
                lineToRelative(1.73f, 1.01f)
                lineToRelative(2.55f, -4.38f)
                arcTo(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 18.93f)
                lineTo(11f, 24f)
                horizontalLineToRelative(2f)
                lineTo(13f, 18.93f)
                arcToRelative(6.92f, 6.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.64f, -0.45f)
                lineToRelative(2.55f, 4.39f)
                lineToRelative(1.73f, -1.01f)
                lineTo(16.36f, 17.47f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.12f, -1.13f)
                lineToRelative(4.38f, 2.55f)
                lineToRelative(1f, -1.73f)
                lineToRelative(-4.38f, -2.55f)
                arcTo(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.93f, 13f)
                close()
                moveTo(17f, 12f)
                curveToRelative(-0.21f, 6.61f, -9.79f, 6.61f, -10f, 0f)
                curveTo(7.21f, 5.39f, 16.79f, 5.39f, 17f, 12f)
                close()
            }
        }.also { _Sun = it}
