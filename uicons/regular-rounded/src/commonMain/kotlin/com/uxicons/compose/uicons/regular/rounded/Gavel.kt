package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gavel: ImageVector? = null

val Icons.Rr.Gavel: ImageVector
    get() = _Gavel ?: UXIcon(name = "Gavel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 10.81f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-0.55f, 0.55f)
                lineTo(12.66f, 2.27f)
                lineToRelative(0.55f, -0.55f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineTo(4.79f, 7.31f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(0.58f, -0.58f)
                lineToRelative(3.83f, 3.83f)
                lineTo(0.29f, 22.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineTo(12.03f, 13.38f)
                lineToRelative(3.84f, 3.84f)
                lineToRelative(-0.58f, 0.58f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(7f, -7f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(14.62f, 13.14f)
                lineToRelative(-3.67f, -3.67f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(3.67f, 3.67f)
                curveToRelative(-0.79f, 0.79f, -2.19f, 2.19f, -3.04f, 3.04f)
                close()
                moveTo(11.24f, 3.69f)
                lineToRelative(1.33f, 1.33f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.33f, -1.33f)
                lineToRelative(3.04f, -3.04f)
                close()
                moveTo(16.03f, 14.56f)
                curveToRelative(0.85f, -0.85f, 2.25f, -2.25f, 3.04f, -3.04f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.25f, -1.25f)
                close()
            }
        }.also { _Gavel = it}
