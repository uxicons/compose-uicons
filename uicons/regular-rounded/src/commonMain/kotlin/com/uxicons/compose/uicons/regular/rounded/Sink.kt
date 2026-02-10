package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Rr.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.75f, 13f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-5f)
                lineTo(13f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.39f, 0f, 2.41f, 0.85f, 2.49f, 2.07f)
                curveToRelative(0.04f, 0.55f, 0.55f, 0.96f, 1.06f, 0.93f)
                curveToRelative(0.55f, -0.04f, 0.97f, -0.51f, 0.93f, -1.06f)
                curveToRelative(-0.15f, -2.28f, -2.04f, -3.93f, -4.49f, -3.93f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.46f, -3.25f, 3.25f)
                curveToRelative(0f, 4.27f, 3.48f, 7.75f, 7.75f, 7.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(4.27f, 0f, 7.75f, -3.48f, 7.75f, -7.75f)
                curveToRelative(0f, -1.79f, -1.46f, -3.25f, -3.25f, -3.25f)
                close()
                moveTo(16.25f, 22f)
                lineTo(7.75f, 22f)
                curveToRelative(-3.17f, 0f, -5.75f, -2.58f, -5.75f, -5.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                horizontalLineToRelative(17.5f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                curveToRelative(0f, 3.17f, -2.58f, 5.75f, -5.75f, 5.75f)
                close()
            }
        }.also { _Sink = it}
