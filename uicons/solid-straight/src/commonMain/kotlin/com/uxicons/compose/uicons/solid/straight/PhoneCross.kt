package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneCross: ImageVector? = null

val Icons.Ss.PhoneCross: ImageVector
    get() = _PhoneCross ?: UXIcon(name = "PhoneCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.58f, 8.96f)
                lineTo(19.52f, 5.91f)
                lineToRelative(-3.05f, 3.06f)
                lineTo(15.04f, 7.56f)
                lineTo(18.1f, 4.5f)
                lineTo(15.04f, 1.44f)
                lineTo(16.45f, 0.03f)
                curveToRelative(0.23f, 0.23f, 1.53f, 1.53f, 3.06f, 3.05f)
                lineTo(22.56f, 0.02f)
                lineToRelative(1.41f, 1.42f)
                lineTo(20.93f, 4.49f)
                lineToRelative(3.06f, 3.05f)
                close()
                moveTo(13.5f, 16.96f)
                arcToRelative(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.45f, -6.47f)
                lineToRelative(4.12f, -4.13f)
                lineTo(4.91f, 0.1f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.02f, 7.48f)
                curveToRelative(0f, 7.25f, 9.25f, 16.5f, 16.5f, 16.5f)
                arcToRelative(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.72f)
                lineTo(23.9f, 19.09f)
                lineToRelative(-6.26f, -6.27f)
                close()
            }
        }.also { _PhoneCross = it}
