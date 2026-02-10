package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardPrescription: ImageVector? = null

val Icons.Ss.ClipboardPrescription: ImageVector
    get() = _ClipboardPrescription ?: UXIcon(name = "ClipboardPrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(3f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(17f, 20f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(-1.29f, -1.93f)
                lineToRelative(-1.32f, 1.93f)
                horizontalLineToRelative(-2.19f)
                lineToRelative(2.42f, -3.57f)
                lineToRelative(-2.29f, -3.43f)
                horizontalLineToRelative(-1.13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.22f, -0.73f, 2.26f, -1.77f, 2.73f)
                lineToRelative(1.33f, 2.02f)
                lineToRelative(1.19f, -1.76f)
                horizontalLineToRelative(2.25f)
                lineToRelative(-2.35f, 3.42f)
                lineToRelative(2.35f, 3.58f)
                close()
                moveTo(11f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ClipboardPrescription = it}
