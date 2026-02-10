package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessWatch: ImageVector? = null

val Icons.Ts.FitnessWatch: ImageVector
    get() = _FitnessWatch ?: UXIcon(name = "FitnessWatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 3.05f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(17f, 3f)
                lineTo(7.0f, 3f)
                lineTo(6.96f, -0.01f)
                lineToRelative(-1f, 0.01f)
                lineToRelative(0.03f, 3.05f)
                curveToRelative(-1.14f, 0.23f, -2.0f, 1.24f, -2.0f, 2.45f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineToRelative(3.05f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                lineTo(20f, 5.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(19f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(13.75f, 9f)
                curveToRelative(-0.78f, 0f, -1.38f, 0.33f, -1.77f, 0.77f)
                curveToRelative(-0.36f, -0.43f, -0.93f, -0.77f, -1.73f, -0.77f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.09f, -2.25f, 2.42f)
                curveToRelative(0.12f, 2.47f, 3.38f, 4.52f, 4f, 4.98f)
                curveToRelative(0.61f, -0.45f, 3.88f, -2.51f, 4f, -4.98f)
                curveToRelative(0f, -1.34f, -1.01f, -2.42f, -2.25f, -2.42f)
                close()
                moveTo(12f, 15.19f)
                curveToRelative(-1.04f, -0.76f, -3f, -2.46f, -3f, -3.76f)
                curveToRelative(0f, -0.79f, 0.56f, -1.43f, 1.25f, -1.43f)
                curveToRelative(0.99f, 0f, 1.21f, 0.8f, 1.21f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.22f, 0.31f, -1f, 1.29f, -1f)
                curveToRelative(0.69f, 0f, 1.25f, 0.64f, 1.25f, 1.43f)
                curveToRelative(0f, 1.3f, -1.96f, 3.0f, -3f, 3.76f)
                close()
            }
        }.also { _FitnessWatch = it}
