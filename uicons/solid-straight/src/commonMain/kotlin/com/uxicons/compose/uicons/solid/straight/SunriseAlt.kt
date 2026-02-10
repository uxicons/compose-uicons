package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SunriseAlt: ImageVector? = null

val Icons.Ss.SunriseAlt: ImageVector
    get() = _SunriseAlt ?: UXIcon(name = "SunriseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.92f, 22f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.43f, -1.62f)
                lineToRelative(4.4f, -2.56f)
                lineToRelative(-1.01f, -1.73f)
                lineToRelative(-4.4f, 2.56f)
                arcToRelative(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -1.14f)
                lineToRelative(2.55f, -4.39f)
                lineToRelative(-1.73f, -1.01f)
                lineTo(14.61f, 16.51f)
                arcTo(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 16.08f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.08f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.6f, 0.42f)
                lineToRelative(-2.55f, -4.38f)
                lineTo(5.13f, 13.13f)
                lineToRelative(2.55f, 4.38f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 1.14f)
                lineTo(2.14f, 16.09f)
                lineTo(1.13f, 17.82f)
                lineToRelative(4.38f, 2.55f)
                arcTo(6.97f, 6.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.08f, 22f)
                horizontalLineTo(0f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                verticalLineTo(22f)
                close()
                moveTo(15.29f, 5.29f)
                lineToRelative(1.41f, -1.41f)
                lineTo(13.41f, 0.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 0f)
                lineTo(7.29f, 3.88f)
                lineTo(8.71f, 5.29f)
                lineTo(11f, 3f)
                verticalLineTo(9f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
            }
        }.also { _SunriseAlt = it}
