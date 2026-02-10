package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottlePill: ImageVector? = null

val Icons.Ss.PrescriptionBottlePill: ImageVector
    get() = _PrescriptionBottlePill ?: UXIcon(name = "PrescriptionBottlePill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.26f, 21.33f)
                curveToRelative(-0.79f, -1.07f, -1.26f, -2.4f, -1.26f, -3.83f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(1.43f, 0f, 2.75f, 0.47f, 3.83f, 1.26f)
                lineToRelative(-9.07f, 9.07f)
                close()
                moveTo(13.67f, 22.74f)
                curveToRelative(1.07f, 0.79f, 2.4f, 1.26f, 3.83f, 1.26f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -1.43f, -0.47f, -2.75f, -1.26f, -3.83f)
                lineToRelative(-9.07f, 9.07f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
                curveToRelative(0.87f, 0f, 1.71f, 0.13f, 2.5f, 0.38f)
                verticalLineToRelative(-2.38f)
                lineTo(2f, 7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(2f, 12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(2f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(2f, 20f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7.03f)
                curveToRelative(-1.85f, -1.56f, -3.03f, -3.89f, -3.03f, -6.5f)
                close()
            }
        }.also { _PrescriptionBottlePill = it}
