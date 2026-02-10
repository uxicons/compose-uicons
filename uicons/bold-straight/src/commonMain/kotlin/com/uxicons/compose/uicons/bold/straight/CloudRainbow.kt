package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudRainbow: ImageVector? = null

val Icons.Bs.CloudRainbow: ImageVector
    get() = _CloudRainbow ?: UXIcon(name = "CloudRainbow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.88f, 12.8f)
                arcTo(10.45f, 10.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                verticalLineToRelative(3f)
                arcToRelative(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.07f, 1.99f)
                arcTo(7.18f, 7.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.88f, 12.8f)
                close()
                moveTo(13.04f, 9.56f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.98f, 2.27f)
                arcTo(12.46f, 12.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 8f)
                verticalLineTo(5f)
                arcTo(15.45f, 15.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 9.56f)
                close()
                moveTo(7.76f, 8.04f)
                curveTo(8f, 8.02f, 8.25f, 8f, 8.5f, 8f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.76f, 0.55f)
                arcTo(17.43f, 17.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3f)
                verticalLineTo(0f)
                arcTo(20.46f, 20.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.76f, 8.04f)
                close()
                moveTo(18f, 18.75f)
                arcToRelative(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.37f, -5.18f)
                arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 15.26f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
                horizontalLineToRelative(8.25f)
                arcTo(5.26f, 5.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18.75f)
                close()
                moveTo(6f, 18f)
                verticalLineTo(15.5f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, -0.31f)
                lineToRelative(0.17f, 1.31f)
                horizontalLineTo(12.75f)
                arcToRelative(2.25f, 2.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.5f)
                horizontalLineTo(4.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
                close()
            }
        }.also { _CloudRainbow = it}
