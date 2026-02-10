package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrenchFries: ImageVector? = null

val Icons.Bs.FrenchFries: ImageVector
    get() = _FrenchFries ?: UXIcon(name = "FrenchFries") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.03f, 5.9f)
                lineTo(21.2f, 4.91f)
                lineTo(19.06f, 11f)
                lineTo(17.63f, 11f)
                lineTo(19.48f, 0.77f)
                lineTo(16.52f, 0.23f)
                lineTo(14.58f, 11f)
                lineTo(13.5f, 11f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 11f)
                lineTo(9.44f, 11f)
                lineTo(7.5f, 0.23f)
                lineTo(4.54f, 0.77f)
                lineTo(6.39f, 11f)
                lineTo(4.96f, 11f)
                lineTo(2.98f, 4.82f)
                lineTo(0.13f, 5.73f)
                lineTo(1.81f, 11f)
                lineTo(0.03f, 11f)
                lineTo(2.32f, 21.26f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.73f, 24f)
                lineTo(18.27f, 24f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -2.73f)
                lineTo(23.99f, 11f)
                lineTo(22.24f, 11f)
                close()
                moveTo(18.76f, 20.61f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, 0.39f)
                lineTo(5.73f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.49f, -0.39f)
                lineTo(3.77f, 14f)
                lineTo(20.24f, 14f)
                close()
            }
        }.also { _FrenchFries = it}
