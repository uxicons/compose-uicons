package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Ss.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 13f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(-2.33f, 3.83f)
                lineToRelative(-3.19f, -4.94f)
                curveToRelative(2.75f, -0.55f, 4.83f, -2.98f, 4.83f, -5.88f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(5.88f)
                lineToRelative(4.36f, 6.69f)
                lineToRelative(-3.23f, 5.31f)
                horizontalLineToRelative(2.3f)
                lineToRelative(2.12f, -3.48f)
                lineToRelative(2.27f, 3.48f)
                horizontalLineToRelative(2.3f)
                lineToRelative(-3.45f, -5.34f)
                lineToRelative(3.45f, -5.66f)
                close()
                moveTo(5.0f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.0f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(3f)
                close()
            }
        }.also { _Prescription = it}
