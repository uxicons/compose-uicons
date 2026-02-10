package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Bs.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.61f, 17.01f)
                lineToRelative(-2.8f, -10.1f)
                arcTo(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, 7.4f)
                lineTo(0.32f, 17.14f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.44f, 3.04f)
                lineTo(6.91f, 20.18f)
                arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.15f, 0f)
                lineTo(21.2f, 20.18f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.41f, -3.17f)
                close()
                moveTo(3.38f, 17.18f)
                lineTo(5.42f, 8.04f)
                arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, -0.33f)
                lineToRelative(2.63f, 9.46f)
                close()
            }
        }.also { _Bell = it}
