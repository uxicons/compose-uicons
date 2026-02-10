package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottlePill: ImageVector? = null

val Icons.Bs.PrescriptionBottlePill: ImageVector
    get() = _PrescriptionBottlePill ?: UXIcon(name = "PrescriptionBottlePill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.34f, 24f)
                horizontalLineToRelative(-5.84f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 5f)
                lineTo(0f, 5f)
                verticalLineToRelative(-2f)
                curveTo(0f, 1.34f, 1.34f, 0f, 3f, 0f)
                horizontalLineToRelative(16f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.51f)
                curveToRelative(-0.94f, -0.33f, -1.95f, -0.51f, -3f, -0.51f)
                verticalLineToRelative(-3f)
                lineTo(5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.44f)
                curveToRelative(0.58f, 1.17f, 1.4f, 2.19f, 2.41f, 3f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, 0.11f, 1.08f, 0.32f, 1.56f)
                lineToRelative(5.24f, -5.24f)
                curveToRelative(-0.48f, -0.2f, -1.01f, -0.32f, -1.56f, -0.32f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                close()
                moveTo(21f, 17f)
                curveToRelative(0f, -0.55f, -0.11f, -1.08f, -0.32f, -1.56f)
                lineToRelative(-5.24f, 5.24f)
                curveToRelative(0.48f, 0.2f, 1.01f, 0.32f, 1.56f, 0.32f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                close()
            }
        }.also { _PrescriptionBottlePill = it}
