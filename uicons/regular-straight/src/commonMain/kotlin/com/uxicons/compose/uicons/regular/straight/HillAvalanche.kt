package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HillAvalanche: ImageVector? = null

val Icons.Rs.HillAvalanche: ImageVector
    get() = _HillAvalanche ?: UXIcon(name = "HillAvalanche") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(20.21f)
                lineToRelative(-23.21f, -23.21f)
                close()
                moveTo(2f, 5.61f)
                lineTo(18.39f, 22f)
                horizontalLineToRelative(-15.39f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(8.02f, 5.97f)
                curveToRelative(-1.35f, -1.29f, -1.35f, -3.65f, 0.01f, -4.94f)
                curveToRelative(1.12f, -1.12f, 2.83f, -1.32f, 4.16f, -0.58f)
                curveToRelative(0.56f, -0.29f, 1.18f, -0.44f, 1.81f, -0.44f)
                curveToRelative(1.9f, 0f, 3.49f, 1.33f, 3.9f, 3.1f)
                curveToRelative(1.77f, 0.41f, 3.1f, 2.0f, 3.1f, 3.9f)
                curveToRelative(0f, 1.74f, -1.12f, 3.21f, -2.68f, 3.76f)
                lineToRelative(-1.73f, -1.76f)
                horizontalLineToRelative(0.41f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                curveToRelative(-0.91f, 0.01f, -1.29f, 0.52f, -1.88f, 0.95f)
                lineToRelative(-0.62f, -0.56f)
                curveToRelative(-0.59f, -0.53f, -1.5f, -0.51f, -2.06f, 0.05f)
                curveToRelative(-0.58f, 0.56f, -0.58f, 1.56f, 0f, 2.12f)
                lineToRelative(9.77f, 9.97f)
                curveToRelative(0.6f, 0.6f, 1.69f, 0.61f, 2.31f, -0.01f)
                curveToRelative(0.31f, -0.31f, 0.48f, -0.72f, 0.48f, -1.16f)
                reflectiveCurveToRelative(-0.17f, -0.85f, -0.48f, -1.16f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(1.41f, 1.35f, 1.41f, 3.79f, 0f, 5.14f)
                curveToRelative(-1.35f, 1.41f, -3.79f, 1.41f, -5.14f, 0f)
                close()
            }
        }.also { _HillAvalanche = it}
