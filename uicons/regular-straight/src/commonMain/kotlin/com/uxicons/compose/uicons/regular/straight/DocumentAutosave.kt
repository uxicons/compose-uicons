package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentAutosave: ImageVector? = null

val Icons.Rs.DocumentAutosave: ImageVector
    get() = _DocumentAutosave ?: UXIcon(name = "DocumentAutosave") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.3f, 22f)
                horizontalLineToRelative(-8.3f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(0.03f)
                curveToRelative(0.69f, 0.04f, 1.36f, 0.15f, 2f, 0.35f)
                verticalLineToRelative(-1.79f)
                lineToRelative(-7.59f, -7.59f)
                horizontalLineToRelative(-9.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.68f, -0.57f, -1.26f, -1.25f, -1.73f, -2f)
                close()
                moveTo(13f, 3.41f)
                lineTo(16.59f, 7f)
                horizontalLineToRelative(-3.59f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.91f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-1.37f, 0f, -2.58f, -0.63f, -3.4f, -1.6f)
                lineToRelative(-1.1f, 1.1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.46f, 0.6f, 1.17f, 1f, 1.99f, 1f)
                reflectiveCurveToRelative(1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(2.24f)
                curveToRelative(-0.62f, 1.74f, -2.27f, 3f, -4.22f, 3f)
                close()
                moveTo(22f, 16.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                lineToRelative(1f, -1f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.46f, -0.6f, -1.17f, -1f, -1.99f, -1f)
                reflectiveCurveToRelative(-1.53f, 0.4f, -1.99f, 1f)
                horizontalLineToRelative(-2.24f)
                curveToRelative(0.62f, -1.74f, 2.27f, -3f, 4.22f, -3f)
                curveToRelative(1.37f, 0f, 2.58f, 0.63f, 3.4f, 1.6f)
                lineToRelative(1.1f, -1.1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _DocumentAutosave = it}
