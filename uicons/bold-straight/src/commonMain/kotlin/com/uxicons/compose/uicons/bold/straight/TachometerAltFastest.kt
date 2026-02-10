package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAltFastest: ImageVector? = null

val Icons.Bs.TachometerAltFastest: ImageVector
    get() = _TachometerAltFastest ?: UXIcon(name = "TachometerAltFastest") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.89f, 12.34f)
                lineToRelative(4.42f, 2.34f)
                lineToRelative(-1.4f, 2.65f)
                lineToRelative(-4.49f, -2.37f)
                arcTo(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.89f, -2.66f)
                close()
                moveTo(16.95f, 8.05f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9.9f, 9.9f)
                arcToRelative(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, 0.78f)
                lineTo(9.7f, 16.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.13f, -6.1f)
                arcToRelative(4.08f, 4.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.56f, 0.69f)
                lineTo(19f, 12.77f)
                arcTo(6.94f, 6.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.95f, 8.05f)
                close()
                moveTo(24f, 13f)
                arcToRelative(12.04f, 12.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, 9.71f)
                lineTo(18.64f, 23f)
                lineTo(5.36f, 23f)
                lineToRelative(-0.39f, -0.29f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.35f, 20f)
                lineTo(17.65f, 20f)
                arcTo(9.03f, 9.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                close()
            }
        }.also { _TachometerAltFastest = it}
