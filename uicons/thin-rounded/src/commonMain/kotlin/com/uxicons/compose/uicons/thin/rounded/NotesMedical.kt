package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NotesMedical: ImageVector? = null

val Icons.Tr.NotesMedical: ImageVector
    get() = _NotesMedical ?: UXIcon(name = "NotesMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 13.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(9.37f)
                curveToRelative(0f, 0.92f, -0.37f, 1.82f, -1.02f, 2.48f)
                lineToRelative(-2.63f, 2.63f)
                curveToRelative(-0.65f, 0.65f, -1.55f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-9.37f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(4f, 4.5f)
                curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(8.5f, 19f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(22.99f, 14f)
                horizontalLineToRelative(-3.49f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.49f)
                curveToRelative(0.61f, -0.03f, 1.21f, -0.28f, 1.64f, -0.72f)
                lineToRelative(2.63f, -2.63f)
                curveToRelative(0.44f, -0.44f, 0.69f, -1.03f, 0.72f, -1.64f)
                close()
                moveTo(17.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _NotesMedical = it}
