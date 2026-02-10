package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePrescription: ImageVector? = null

val Icons.Ss.FilePrescription: ImageVector
    get() = _FilePrescription ?: UXIcon(name = "FilePrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 7f)
                verticalLineToRelative(17f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(12.65f, 17.42f)
                lineToRelative(2.35f, -3.42f)
                horizontalLineToRelative(-2.25f)
                lineToRelative(-1.19f, 1.76f)
                lineToRelative(-1.33f, -2.02f)
                curveToRelative(1.04f, -0.47f, 1.77f, -1.51f, 1.77f, -2.73f)
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
                close()
                moveTo(17f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(17f, 0.59f)
                close()
            }
        }.also { _FilePrescription = it}
