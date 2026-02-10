package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Medication: ImageVector? = null

val Icons.Bs.Medication: ImageVector
    get() = _Medication ?: UXIcon(name = "Medication") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 14f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.0f)
                lineToRelative(1.95f, -1.95f)
                curveToRelative(0.32f, -0.32f, 0.68f, -0.57f, 1.05f, -0.79f)
                verticalLineToRelative(-1.26f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(12.19f)
                curveToRelative(-0.69f, -0.86f, -1.09f, -1.89f, -1.16f, -3f)
                close()
                moveTo(23.03f, 13.97f)
                curveToRelative(-1.29f, -1.29f, -3.38f, -1.29f, -4.67f, 0f)
                lineToRelative(-1.49f, 1.49f)
                lineToRelative(4.67f, 4.67f)
                lineToRelative(1.49f, -1.49f)
                curveToRelative(1.29f, -1.29f, 1.29f, -3.38f, 0f, -4.67f)
                close()
                moveTo(13.97f, 18.36f)
                curveToRelative(-1.29f, 1.29f, -1.29f, 3.38f, 0f, 4.67f)
                reflectiveCurveToRelative(3.38f, 1.29f, 4.67f, 0f)
                lineToRelative(1.49f, -1.49f)
                lineToRelative(-4.67f, -4.67f)
                lineToRelative(-1.49f, 1.49f)
                close()
            }
        }.also { _Medication = it}
