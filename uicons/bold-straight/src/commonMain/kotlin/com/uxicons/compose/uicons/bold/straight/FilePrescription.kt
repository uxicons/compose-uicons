package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePrescription: ImageVector? = null

val Icons.Bs.FilePrescription: ImageVector
    get() = _FilePrescription ?: UXIcon(name = "FilePrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.38f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 5.67f)
                lineTo(16.38f, 0f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                lineTo(5f, 21f)
                close()
                moveTo(13.74f, 13f)
                lineToRelative(-1.19f, 1.76f)
                lineToRelative(-1.33f, -2.02f)
                curveToRelative(1.04f, -0.47f, 1.77f, -1.52f, 1.77f, -2.74f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.13f)
                lineToRelative(2.29f, 3.43f)
                lineToRelative(-2.42f, 3.57f)
                horizontalLineToRelative(2.19f)
                lineToRelative(1.32f, -1.93f)
                lineToRelative(1.29f, 1.93f)
                horizontalLineToRelative(2.19f)
                lineToRelative(-2.35f, -3.58f)
                lineToRelative(2.35f, -3.42f)
                horizontalLineToRelative(-2.25f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FilePrescription = it}
