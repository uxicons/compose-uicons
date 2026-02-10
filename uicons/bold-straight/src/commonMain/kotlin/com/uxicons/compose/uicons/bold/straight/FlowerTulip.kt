package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Bs.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.86f, 14.92f)
                arcTo(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 17.24f)
                verticalLineTo(15.29f)
                arcToRelative(6.62f, 6.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.11f, -6.44f)
                curveToRelative(0f, -2.43f, -1.37f, -5.06f, -4.07f, -7.81f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.09f, 0f)
                curveTo(6.75f, 3.79f, 5.39f, 6.42f, 5.39f, 8.85f)
                arcTo(6.62f, 6.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 15.29f)
                verticalLineToRelative(1.95f)
                arcToRelative(9.47f, 9.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.36f, -2.31f)
                lineTo(0f, 15.21f)
                verticalLineToRelative(1.17f)
                arcToRelative(6.76f, 6.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 5.36f)
                curveToRelative(2.56f, 2.22f, 6.58f, 2.35f, 8.64f, 2.24f)
                horizontalLineToRelative(2.13f)
                curveToRelative(4.28f, 0.38f, 11.12f, -1.27f, 10.94f, -7.6f)
                verticalLineTo(15.21f)
                close()
                moveTo(4.25f, 19.46f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.14f, 17.6f)
                arcTo(6.6f, 6.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.71f, 21f)
                curveTo(7.92f, 20.97f, 5.61f, 20.64f, 4.25f, 19.46f)
                close()
                moveTo(8.39f, 8.85f)
                arcTo(7.62f, 7.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 4.36f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(4.36f)
                curveTo(20.07f, 11.75f, 9.2f, 15.88f, 8.39f, 8.85f)
                close()
                moveTo(19.75f, 19.46f)
                curveToRelative(-1.36f, 1.18f, -3.67f, 1.51f, -5.46f, 1.54f)
                arcToRelative(6.72f, 6.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.58f, -3.4f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.75f, 19.46f)
                close()
            }
        }.also { _FlowerTulip = it}
