package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardPrescription: ImageVector? = null

val Icons.Sr.ClipboardPrescription: ImageVector
    get() = _ClipboardPrescription ?: UXIcon(name = "ClipboardPrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(3f, 7f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(0.17f)
                curveToRelative(0.41f, -1.16f, 1.52f, -2f, 2.83f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.3f, 0f, 2.42f, 0.84f, 2.83f, 2f)
                horizontalLineToRelative(0.17f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(15.44f, 16.5f)
                lineToRelative(1.37f, -1.92f)
                curveToRelative(0.32f, -0.45f, 0.22f, -1.07f, -0.23f, -1.4f)
                curveToRelative(-0.45f, -0.32f, -1.07f, -0.22f, -1.4f, 0.23f)
                lineToRelative(-0.97f, 1.36f)
                lineToRelative(-1.61f, -2.25f)
                curveToRelative(0.84f, -0.53f, 1.39f, -1.47f, 1.39f, -2.53f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.49f)
                lineToRelative(2.5f, 3.5f)
                lineToRelative(-1.37f, 1.92f)
                curveToRelative(-0.32f, 0.45f, -0.22f, 1.07f, 0.23f, 1.4f)
                curveToRelative(0.18f, 0.12f, 0.38f, 0.19f, 0.58f, 0.19f)
                curveToRelative(0.31f, 0f, 0.62f, -0.15f, 0.81f, -0.42f)
                lineToRelative(0.97f, -1.36f)
                lineToRelative(0.97f, 1.36f)
                curveToRelative(0.2f, 0.27f, 0.5f, 0.42f, 0.81f, 0.42f)
                curveToRelative(0.2f, 0f, 0.4f, -0.06f, 0.58f, -0.19f)
                curveToRelative(0.45f, -0.32f, 0.55f, -0.95f, 0.23f, -1.4f)
                lineToRelative(-1.37f, -1.92f)
                close()
            }
        }.also { _ClipboardPrescription = it}
