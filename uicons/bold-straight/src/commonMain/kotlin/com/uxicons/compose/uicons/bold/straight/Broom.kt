package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Broom: ImageVector? = null

val Icons.Bs.Broom: ImageVector
    get() = _Broom ?: UXIcon(name = "Broom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.44f, 8.64f)
                lineTo(24f, 4.07f)
                lineTo(21.88f, 1.95f)
                lineTo(17.29f, 6.54f)
                lineToRelative(-1.75f, -1.71f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.33f, -0.09f)
                arcTo(18.25f, 18.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.34f, 8.32f)
                lineTo(0f, 10.18f)
                verticalLineTo(11.3f)
                arcTo(12.85f, 12.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.96f, 24f)
                horizontalLineToRelative(1.35f)
                lineToRelative(0.39f, -0.27f)
                arcToRelative(14.82f, 14.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.8f, -11.96f)
                arcToRelative(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.74f, -1.84f)
                close()
                moveTo(13.36f, 21f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(10.19f, 10.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.79f, -0.39f)
                arcToRelative(11.56f, 11.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.28f, -3.18f)
                lineToRelative(0.49f, -0.73f)
                lineToRelative(-2.48f, -1.69f)
                lineToRelative(-0.49f, 0.72f)
                arcToRelative(8.58f, 8.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.22f, 2.82f)
                lineTo(6.9f, 18.99f)
                arcTo(9.89f, 9.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.25f, 17.42f)
                arcToRelative(11.61f, 11.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.64f, -2.4f)
                lineToRelative(-2.1f, -2.14f)
                arcToRelative(8.63f, 8.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.1f, 1.93f)
                arcToRelative(9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.62f, -2.41f)
                lineTo(7.18f, 11.2f)
                arcTo(16.87f, 16.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 9.04f)
                lineTo(17.83f, 15.2f)
                arcTo(12.49f, 12.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.36f, 21f)
                close()
            }
        }.also { _Broom = it}
