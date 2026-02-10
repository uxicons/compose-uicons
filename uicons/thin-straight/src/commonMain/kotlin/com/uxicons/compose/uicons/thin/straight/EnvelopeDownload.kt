package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDownload: ImageVector? = null

val Icons.Ts.EnvelopeDownload: ImageVector
    get() = _EnvelopeDownload ?: UXIcon(name = "EnvelopeDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.81f, 9.72f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.11f, 0.19f, 0.15f)
                lineTo(19f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.86f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.19f, -0.15f)
                lineToRelative(2.91f, -2.91f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.91f, 2.91f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.58f, -1.39f, 0.58f)
                reflectiveCurveToRelative(-1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-2.87f, -2.87f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.87f, 2.87f)
                close()
                moveTo(23f, 11.15f)
                verticalLineToRelative(11.85f)
                lineTo(1f, 23f)
                lineTo(1f, 6.88f)
                lineToRelative(7.8f, 7.8f)
                curveToRelative(0.88f, 0.88f, 2.03f, 1.31f, 3.18f, 1.31f)
                reflectiveCurveToRelative(2.31f, -0.44f, 3.18f, -1.31f)
                lineToRelative(2.23f, -2.29f)
                curveToRelative(-0.25f, -0.16f, -0.49f, -0.34f, -0.7f, -0.55f)
                lineToRelative(-0.08f, -0.08f)
                lineToRelative(-2.15f, 2.22f)
                curveToRelative(-1.36f, 1.36f, -3.58f, 1.37f, -4.95f, 0f)
                lineTo(1.23f, 5.7f)
                curveToRelative(0.27f, -0.42f, 0.73f, -0.7f, 1.27f, -0.7f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-13.86f)
                lineToRelative(-1f, 1f)
                close()
            }
        }.also { _EnvelopeDownload = it}
