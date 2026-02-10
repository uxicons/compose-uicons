package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCross: ImageVector? = null

val Icons.Bs.PhoneCross: ImageVector
    get() = _PhoneCross ?: UXIcon(name = "PhoneCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.33f, 14.89f)
                arcTo(10.7f, 10.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.12f, 9.66f)
                lineTo(12.08f, 6.7f)
                lineTo(5.44f, 0.06f)
                lineTo(1.8f, 3.7f)
                curveToRelative(-7.39f, 7.91f, 10.58f, 25.89f, 18.5f, 18.5f)
                lineToRelative(3.65f, -3.65f)
                lineTo(17.3f, 11.92f)
                close()
                moveTo(18.17f, 20.08f)
                curveTo(13.43f, 24.42f, -0.56f, 11.34f, 3.92f, 5.82f)
                lineTo(5.44f, 4.3f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.57f, 8.97f)
                lineToRelative(0.37f, 0.92f)
                arcToRelative(13.94f, 13.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.2f, 8.18f)
                lineToRelative(0.91f, 0.35f)
                lineTo(17.3f, 16.16f)
                lineToRelative(2.4f, 2.4f)
                close()
                moveTo(21.14f, 4.98f)
                lineTo(23.97f, 7.81f)
                lineTo(21.85f, 9.94f)
                lineTo(19.02f, 7.11f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(14.06f, 7.81f)
                lineTo(16.9f, 4.98f)
                lineTo(14.06f, 2.15f)
                lineTo(16.19f, 0.03f)
                lineToRelative(2.83f, 2.83f)
                lineTo(21.85f, 0.03f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _PhoneCross = it}
