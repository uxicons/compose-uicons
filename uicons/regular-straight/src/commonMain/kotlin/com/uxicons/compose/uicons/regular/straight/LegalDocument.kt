package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalDocument: ImageVector? = null

val Icons.Rs.LegalDocument: ImageVector
    get() = _LegalDocument ?: UXIcon(name = "LegalDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.41f)
                lineToRelative(-7.59f, -7.59f)
                horizontalLineToRelative(-9.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(13f, 3.41f)
                lineTo(16.59f, 7f)
                horizontalLineToRelative(-3.59f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7.63f)
                close()
                moveTo(4f, 17f)
                horizontalLineToRelative(6.5f)
                lineToRelative(-0.63f, 2f)
                horizontalLineToRelative(-5.87f)
                close()
                moveTo(24f, 18.66f)
                verticalLineToRelative(0.34f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-0.34f)
                lineToRelative(0.84f, -2.66f)
                horizontalLineToRelative(-1.84f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.82f)
                lineToRelative(0.93f, 2.6f)
                verticalLineToRelative(0.57f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.11f, 1.03f, -0.98f, 1.83f, -2.04f, 1.83f)
                curveToRelative(-1.14f, 0f, -2.05f, -0.92f, -2.05f, -2.05f)
                verticalLineToRelative(-0.33f)
                lineToRelative(1.5f, -4.61f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.5f, 4.66f)
                close()
            }
        }.also { _LegalDocument = it}
