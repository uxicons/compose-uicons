package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Yandex: ImageVector? = null

val Icons.Brand.Yandex: ImageVector
    get() = _Yandex ?: UXIcon(name = "Yandex") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.1f, 24f)
            verticalLineToRelative(-2.42f)
            curveToRelative(0f, -3.28f, -0.38f, -4.9f, -1.7f, -7.74f)
            lineTo(1.99f, 0f)
            horizontalLineToRelative(4.43f)
            lineToRelative(5.44f, 11.85f)
            curveToRelative(1.59f, 3.45f, 2.29f, 5.25f, 2.29f, 9.22f)
            verticalLineTo(24f)
            horizontalLineTo(10.1f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.69f, 11.6f)
            lineToRelative(5.05f, -11.6f)
            lineToRelative(4.26f, 0f)
            lineToRelative(-5.12f, 11.6f)
            close()
        }
    }.also { _Yandex = it }
