package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medication: ImageVector? = null

val Icons.Sr.Medication: ImageVector
    get() = _Medication ?: UXIcon(name = "Medication") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.87f, 15.46f)
                lineToRelative(1.49f, -1.49f)
                curveToRelative(1.29f, -1.29f, 3.38f, -1.29f, 4.67f, 0f)
                curveToRelative(1.29f, 1.29f, 1.29f, 3.38f, 0f, 4.67f)
                lineToRelative(-1.49f, 1.49f)
                lineToRelative(-4.67f, -4.67f)
                close()
                moveTo(15.46f, 16.87f)
                lineTo(13.97f, 18.36f)
                curveToRelative(-1.29f, 1.29f, -1.29f, 3.38f, 0f, 4.67f)
                reflectiveCurveToRelative(3.38f, 1.29f, 4.67f, 0f)
                lineToRelative(1.49f, -1.49f)
                lineToRelative(-4.67f, -4.67f)
                close()
                moveTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
                moveTo(12.19f, 24f)
                horizontalLineToRelative(-7.19f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.05f)
                curveToRelative(0f, -2.18f, 1.77f, -3.95f, 3.95f, -3.95f)
                lineToRelative(0.05f, -2f)
                horizontalLineToRelative(8.01f)
                lineToRelative(-0.01f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(0.5f)
                lineToRelative(-3.34f, 3.34f)
                curveToRelative(-0.65f, 0.65f, -1.17f, 1.43f, -1.43f, 2.31f)
                curveToRelative(-0.53f, 1.79f, -0.11f, 3.52f, 0.96f, 4.85f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Medication = it}
