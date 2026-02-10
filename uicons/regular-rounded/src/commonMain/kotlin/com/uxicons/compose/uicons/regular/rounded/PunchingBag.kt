package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PunchingBag: ImageVector? = null

val Icons.Rr.PunchingBag: ImageVector
    get() = _PunchingBag ?: UXIcon(name = "PunchingBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.09f, 8.15f)
                curveToRelative(-0.16f, -0.19f, -0.42f, -0.51f, -0.58f, -0.69f)
                lineToRelative(-4.52f, -5.32f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.13f)
                lineToRelative(-4.99f, 5.87f)
                curveToRelative(-0.02f, 0.02f, -0.04f, 0.06f, -0.06f, 0.08f)
                curveToRelative(-0.6f, 0.82f, -0.96f, 1.83f, -0.96f, 2.92f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.06f, -0.34f, -2.04f, -0.91f, -2.85f)
                close()
                moveTo(12.0f, 4.04f)
                lineTo(13.66f, 6.0f)
                horizontalLineToRelative(-3.33f)
                close()
                moveTo(17f, 19.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                curveToRelative(0f, -0.76f, 0.29f, -1.44f, 0.75f, -1.97f)
                lineToRelative(0.14f, -0.16f)
                curveToRelative(0.54f, -0.54f, 1.29f, -0.87f, 2.11f, -0.87f)
                horizontalLineToRelative(4f)
                curveToRelative(0.8f, 0f, 1.53f, 0.32f, 2.07f, 0.84f)
                lineToRelative(0.43f, 0.51f)
                curveToRelative(0.32f, 0.48f, 0.5f, 1.04f, 0.5f, 1.66f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _PunchingBag = it}
