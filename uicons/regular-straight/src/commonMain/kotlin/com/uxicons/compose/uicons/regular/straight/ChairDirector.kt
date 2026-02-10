package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairDirector: ImageVector? = null

val Icons.Rs.ChairDirector: ImageVector
    get() = _ChairDirector ?: UXIcon(name = "ChairDirector") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 1f)
                lineTo(2f, 1f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 13.59f)
                lineToRelative(9.91f, 5.63f)
                lineTo(1.08f, 24f)
                lineTo(5.25f, 24f)
                lineToRelative(6.75f, -3.63f)
                lineToRelative(6.82f, 3.63f)
                horizontalLineToRelative(4.18f)
                lineToRelative(-8.91f, -4.77f)
                lineToRelative(9.91f, -5.63f)
                lineTo(24f, 0f)
                close()
                moveTo(22f, 3f)
                lineTo(22f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                lineTo(22f, 3f)
                close()
                moveTo(22f, 11.62f)
                curveToRelative(-0.75f, 0.25f, -4.45f, 1.39f, -10f, 1.39f)
                reflectiveCurveToRelative(-9.25f, -1.13f, -10f, -1.39f)
                verticalLineToRelative(-2.62f)
                lineTo(22f, 9f)
                verticalLineToRelative(2.62f)
                close()
                moveTo(12f, 18.09f)
                lineToRelative(-6.27f, -3.56f)
                curveToRelative(1.69f, 0.27f, 3.8f, 0.47f, 6.27f, 0.47f)
                reflectiveCurveToRelative(4.58f, -0.21f, 6.27f, -0.47f)
                lineToRelative(-6.27f, 3.56f)
                close()
            }
        }.also { _ChairDirector = it}
