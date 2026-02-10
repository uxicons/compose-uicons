package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Ts.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.82f)
                lineTo(14.22f, 1.35f)
                curveToRelative(-0.41f, -0.82f, -1.27f, -1.35f, -2.22f, -1.35f)
                reflectiveCurveToRelative(-1.82f, 0.54f, -2.26f, 1.45f)
                lineToRelative(-3.91f, 9.55f)
                lineTo(0f, 11f)
                verticalLineToRelative(1f)
                lineTo(5.41f, 12f)
                lineToRelative(-1.23f, 3f)
                lineTo(0f, 15f)
                verticalLineToRelative(1f)
                lineTo(3.78f, 16f)
                lineTo(0.5f, 24f)
                lineTo(1.58f, 24f)
                lineToRelative(3.27f, -8f)
                horizontalLineToRelative(14.29f)
                lineToRelative(3.28f, 8f)
                horizontalLineToRelative(1.08f)
                lineToRelative(-3.28f, -8f)
                horizontalLineToRelative(3.78f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4.19f)
                lineToRelative(-1.23f, -3f)
                horizontalLineToRelative(5.42f)
                close()
                moveTo(10.65f, 1.86f)
                curveToRelative(0.27f, -0.55f, 0.77f, -0.86f, 1.36f, -0.86f)
                reflectiveCurveToRelative(1.07f, 0.29f, 1.31f, 0.75f)
                lineToRelative(3.79f, 9.25f)
                lineTo(6.9f, 11f)
                lineTo(10.65f, 1.86f)
                close()
                moveTo(18.74f, 15f)
                lineTo(5.27f, 15f)
                lineToRelative(1.23f, -3f)
                horizontalLineToRelative(11.01f)
                lineToRelative(1.23f, 3f)
                close()
            }
        }.also { _AustralSign = it}
