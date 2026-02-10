package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snowboarding: ImageVector? = null

val Icons.Ss.Snowboarding: ImageVector
    get() = _Snowboarding ?: UXIcon(name = "Snowboarding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.19f, 20.86f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.14f, 1.02f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.56f, -0.1f)
                lineToRelative(-2.5f, -1.1f)
                verticalLineTo(14.54f)
                lineToRelative(-3.06f, -2.66f)
                curveToRelative(0.03f, -0.03f, 2.24f, -3.04f, 2.24f, -3.04f)
                lineToRelative(6.29f, 4f)
                lineToRelative(1.07f, -1.69f)
                lineTo(12.29f, 4f)
                horizontalLineTo(8.41f)
                lineTo(5.71f, 1.29f)
                lineTo(4.29f, 2.71f)
                lineTo(7.59f, 6f)
                horizontalLineToRelative(3.23f)
                lineTo(8.62f, 8.85f)
                arcTo(3.02f, 3.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10.68f)
                verticalLineToRelative(2.7f)
                lineTo(4.46f, 15.17f)
                lineToRelative(-1.3f, -0.57f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.97f, -2.65f)
                lineTo(0.37f, 11.1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.97f, 5.32f)
                lineToRelative(16.32f, 7.18f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 21.73f)
                close()
                moveTo(15f, 19.81f)
                lineToRelative(-8.18f, -3.6f)
                lineTo(10f, 14.62f)
                verticalLineTo(11.11f)
                lineToRelative(5f, 4.35f)
                close()
                moveTo(17.62f, -0.02f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.62f, -0.02f)
                close()
            }
        }.also { _Snowboarding = it}
