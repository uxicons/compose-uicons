package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FilePrescription: ImageVector? = null

val Icons.Rs.FilePrescription: ImageVector
    get() = _FilePrescription ?: UXIcon(name = "FilePrescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                lineTo(4f, 22f)
                close()
                moveTo(12.74f, 14f)
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
                moveTo(7f, 10f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _FilePrescription = it}
