package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneSlash: ImageVector? = null

val Icons.Bs.PhoneSlash: ImageVector
    get() = _PhoneSlash ?: UXIcon(name = "PhoneSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 0.06f)
                lineTo(10.26f, 11.62f)
                arcToRelative(12.25f, 12.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, -1.93f)
                lineToRelative(2.96f, -2.96f)
                lineTo(5.41f, 0.09f)
                lineTo(1.77f, 3.73f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.06f)
                curveTo(0f, 11.09f, 1.58f, 14.55f, 4.28f, 17.6f)
                lineTo(0.06f, 21.81f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(21.75f, -21.75f)
                close()
                moveTo(3f, 8.06f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.89f, -2.2f)
                lineTo(5.41f, 4.33f)
                lineToRelative(2.4f, 2.4f)
                lineTo(5.54f, 9f)
                lineToRelative(0.37f, 0.92f)
                arcToRelative(15.39f, 15.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.22f, 3.83f)
                lineToRelative(-1.72f, 1.72f)
                curveTo(4.28f, 13.02f, 3f, 10.3f, 3f, 8.06f)
                close()
                moveTo(17.27f, 11.95f)
                lineTo(23.91f, 18.59f)
                lineToRelative(-3.65f, 3.65f)
                arcTo(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.94f, 24f)
                arcTo(14.21f, 14.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.13f, 21.07f)
                lineToRelative(2.16f, -2.16f)
                arcTo(10.92f, 10.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.94f, 21f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.2f, -0.89f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(-2.4f, -2.4f)
                lineToRelative(-2.25f, 2.26f)
                lineToRelative(-0.91f, -0.35f)
                arcToRelative(15.03f, 15.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.03f, -0.97f)
                close()
            }
        }.also { _PhoneSlash = it}
