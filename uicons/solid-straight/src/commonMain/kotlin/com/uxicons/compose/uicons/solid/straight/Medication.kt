package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medication: ImageVector? = null

val Icons.Ss.Medication: ImageVector
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
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(12f)
                close()
                moveTo(12.19f, 24f)
                horizontalLineToRelative(-12.19f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.95f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.05f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1.5f)
                lineToRelative(-3.45f, 3.45f)
                curveToRelative(-1.0f, 1.0f, -1.55f, 2.33f, -1.55f, 3.75f)
                curveToRelative(0f, 1.22f, 0.43f, 2.37f, 1.19f, 3.3f)
                close()
                moveTo(9f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Medication = it}
